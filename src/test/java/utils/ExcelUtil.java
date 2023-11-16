package utils;
import io.qameta.allure.Step;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.*;
/*
操作Excel文件的封装类
 */
public class ExcelUtil {
    /**
     * 获取Excel文件中单元格的数据，存放在列表里的字典中
     *
     * @param excelPath Excel文件的路径
     * @param sheetName 文件中的表名
     * @return 返回一个列表存放在字典中
     */

    public Object[] getData(String excelPath, String sheetName) {
        try {
            // 创建WorkBook对象
            Workbook workbook = WorkbookFactory.create(new File(excelPath));
            Sheet sheet = workbook.getSheet(sheetName);
//             获取第一行，Row是行对象类型
            Row firstRow = sheet.getRow(0);  // 行索引从0开始获取标题
            int lastCellNum = firstRow.getLastCellNum(); //获取列数
            String[] titles = new String[lastCellNum]; //申明一个存放标题的数组
            for (int i = 0; i < lastCellNum; i++) {
                //t通过下标获取值
                Cell cell = firstRow.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//                System.out.println(cell);
//                cell.setCellType(CellType.STRING);
                // 设置列的类型为字符串
                String title = cell.getStringCellValue();
//                title = title.substring(0);
//                // 值保存到数组
                titles[i] = title;
            }
            // 打印解析出来的标题
//            System.out.println(Arrays.toString(titles));

            // 获取sheet最后一行的行号一共有多少行

            int lastRowNum = sheet.getLastRowNum();
            Object[] obs = new Object[lastRowNum];
            for (int i = 1; i <= lastRowNum; i++) {
                HashMap<String, String> map = new HashMap<>();
                // 每行数据一个数组
                // 获取一行数据
                Row rowData = sheet.getRow(i);
//                System.out.println(rowData);
                //对每一行数据进行遍历

                for (int j = 0; j < lastCellNum; j++) {
                    Cell cell = rowData.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellType(CellType.STRING);
                    String cellValue = cell.getStringCellValue();
                    map.put(titles[j], cellValue);
                }
//                System.out.println(map);
                obs[i - 1] = map;
//                System.out.println(Arrays.toString(obs));
            }
            return obs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Object[0];
    }

    /**
     * 为Excel表格中的某个字段添加数据
     * @param filepath 文件的路径
     * @param sheetname  表的名称
     * @param tille  添加到某个标题
     * @param index  添加到第几行
     * @param value 添加的数据
     */
    public void setData(String filepath, String sheetname, String tille, int index, String value) {
        try {
            //excel模板的位置
            FileInputStream file = new FileInputStream(filepath);
            //创建工作簿  注意这个是针对于xlsx文件的  xls用的是HSSFWorkbook类
            XSSFWorkbook wb = new XSSFWorkbook(file);
            //通过表名获取表对象
            XSSFSheet sheet = wb.getSheet(sheetname);
            //通过下标获取行数据的对象，0行为标题
            Row fistrow = sheet.getRow(0);
            int num = fistrow.getLastCellNum();
            int count = 0;
            //查找符合的标题，为标题的下方赋值
            for (int i = 0; i < num; i++) {
                if (fistrow.getCell(i).getStringCellValue().equals(tille)) {
                    sheet.getRow(index).createCell(i).setCellValue(value);
                    break;
                }
                count++;
                if (count == num) {
                    throw new IOException("未找到tille为" + tille + "的字段");
                }
            }
            //导出文件流
            FileOutputStream out = new FileOutputStream(filepath);
            //写入文件流并保存
            wb.write(out);
            out.flush();
            //关闭文件和文件流对象
            wb.close();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据提供的数据创建一站表
     * @param filepath  文件的存放路径
     * @param sheetname  表名称
     * @param tiles  标题数据
     * @param values 表数据

     */
    public void createTable(String filepath, String sheetname, String[] tiles ,String[][] values)  {
        XSSFWorkbook wd = new XSSFWorkbook();
        XSSFSheet sheet = wd.createSheet(sheetname);
        //创建列样式 我这里只写了边框和居中
        XSSFCellStyle cellStyle = wd.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER_SELECTION);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        try{
            Row row=sheet.createRow(0);
            row.setRowStyle(cellStyle);
            for (int i = 0; i < tiles.length; i++) {
                System.out.println(tiles[i]);
                row.createCell(i).setCellValue(tiles[i]);
                }
            for (int j = 0; j < values.length; j++) {
                Row row1=sheet.createRow(j+1);
                for (int k=0;k<values[j].length;k++){
                    row1.createCell(k).setCellValue(values[j][k]);
                }
            }
            FileOutputStream out = new FileOutputStream(filepath);
            wd.write(out);
            out.flush();
            wd.close();
            out.close();
            System.out.println("写完收工");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }



    public static void main(String[] args) throws IOException, IllegalAccessException {

        ExcelUtil en = new ExcelUtil();
        String[] ts={"姓名","性别","年龄"};
        String[][] vs={{"张三","男","18"},{"小花","女","19"},{"李四","男","20"}};
        en.createTable("./src/datas/test2.xlsx", "响应结果", ts,vs);


//        excel模板的位置


//        //创建工作簿  注意这个是针对于xlsx文件的  xls用的是另一个类
//        HSSFWorkbook sheets = new HSSFWorkbook();
//        //创建工作表
//        HSSFSheet sheet = sheets.createSheet("成绩表");
//        //在sheet里创建第一行，参数为行索引
//        HSSFRow row1=sheet.createRow(0);
//        //创建单元格
//        HSSFCell cell=row1.createCell(0);
//        //设置单元格内容
//        cell.setCellValue("学生成绩表");
//        //合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
////        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
//        //创建列样式 我这里只写了边框和居中
//        HSSFCellStyle cellStyle = sheets.createCellStyle();
//        cellStyle.setAlignment(HorizontalAlignment.CENTER_SELECTION);
//        cellStyle.setBorderTop(BorderStyle.THIN);
//        cellStyle.setBorderBottom(BorderStyle.THIN);
//        cellStyle.setBorderLeft(BorderStyle.THIN);
//        cellStyle.setBorderRight(BorderStyle.THIN);
//        //在sheet里创建第二行
//        HSSFRow row2=sheet.createRow(1);
//        row2.setRowStyle(cellStyle);
//        //创建单元格并设置单元格内容
//        row2.createCell(0).setCellValue("姓名");
//        row2.createCell(1).setCellValue("班级");
//        row2.createCell(2).setCellValue("语文成绩");
//        row2.createCell(3).setCellValue("数学成绩");
//        row2.createCell(4).setCellValue("英语成绩");
//
//        //在sheet里创建第三行
//        HSSFRow row3=sheet.createRow(2);
//        row3.setRowStyle(cellStyle);
//        row3.createCell(0).setCellValue("小明");
//        row3.createCell(1).setCellValue("1班");
//        row3.createCell(2).setCellValue(80);
//        row3.createCell(3).setCellValue(75);
//        row3.createCell(4).setCellValue(88);
//        HSSFRow row4=sheet.createRow(3);
//        row4.setRowStyle(cellStyle);
//        row4.createCell(0).setCellValue("小红");
//        row4.createCell(1).setCellValue("1班");
//        row4.createCell(2).setCellValue(82);
//        row4.createCell(3).setCellValue(70);
//        row4.createCell(4).setCellValue(90);


    }

}
