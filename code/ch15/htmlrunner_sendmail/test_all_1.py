import  unittest
import  time
from HTMLTestRunner import  HTMLTestRunner
suite=unittest.defaultTestLoader.discover('./',pattern='test_*.py')
if __name__=='__main__':

    now = time.strftime("%Y%m%d%H%M%S")
    print(now)
    fp =open("D:\\pythonCode\\Demo181015\\report\\"+now+"result.html","wb")
    runner = HTMLTestRunner(stream=fp,title='测试报告',description='用例执行情况：')
    runner.run(suite)
    fp.close()