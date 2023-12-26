# java接口自动化1.0版  
## 环境依赖与简介
- 需要的技术栈：1.java-jdk 2.maven 3.testng 4.allure
- 这些在电脑需要先安装好以后并做环境变量的配置
- java-jdk主要编译和运行java语言的代码
- maven 用来管理项目所需要的依赖库以及打包测试项目生成allure报告，在pom.xml中进行操作  
- testng用来管理测试用例并记录报告信息为用例添加断言  
- allure 用来生成报告展示效果
## 基础代码学习
- java基础学习可以[点击这里查看](src/main/java/Java_basics/)
## 项目的目录介绍  
- logs:用来记录测试用例执行的日志信息
- report: 存放的allure的结果报告
- configs: 项目的配置文件 主要包括链接的数据库账户以及日志的输出格式的信息  
- datas: 主要存放测试用例需要的测试数据  
- main：是java代码的主要工作区域，此时中可以放一些api测试挡板等
- test：主要存放测试代码的区域范围  
- - dataclass： 主要存放一些存放数据的类：java中会将获取的数据存放再对象中后面根据对象获取数据  
- - requests: 这里是封装的接口类，根据系统的模块不同封装到不同的类，将接口封装到对象的方法中方便测试调用  
- - testCase: 主要存放测试的执行用例，通过testng来进行管理。 
- - utils: 存放封装的的一些工具类，比如：封装数据库的调用，Excel文件的查询与修改，logs日志的输出等......  
- target；Maven项目运行时自动生成的项目包，这里我把allure生成的报告存放再里面，因为Maven运行时只会更新target文件内容，这样才会获取到最新版本的allure报告  
- pom.xml: maven项目的配置文件，用来配置整个项目的依赖库，比较；链接allure的库，操控数据库的依赖等，以及配置testng的执行文件，还有生成的报告地址  
- run_test_java： 存放的执行Maven的命令执行测试用例生成allure报告并打开报告  
- testng，xml：管理需要执行的测试用例，指定那些用例需要执行以及执行的顺序等，testng.xml可以有多个文件，文件名自定义的，只要是，xml就可以管理用例  
## 操作方法
- Windows电脑需要先下载以上提到的必要依赖，并配置好环境变量，然后运行run_test_java.bat文件即可自动运行  
运行逻辑：文件发布命令先给到Maven，然后根据pom.xml文件的配置信息加载里面的依赖项，并运行testng.xml,根据testng.xml中添加的测试case执行测试，生成allure报告，通过allure命令自动打开报告，作为展示  

  -                 后续代码更新中......
