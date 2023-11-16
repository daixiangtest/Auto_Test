call mvn clean test
call allure generate target/allure-json -o report --clean
call allure open report