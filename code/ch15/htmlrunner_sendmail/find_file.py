import  os
# 定义文件目录
result_dir ='D:\\pythonCode\\Demo181015\\report'
lists=os.listdir(result_dir)
print(lists)
# 重新按照时间对目录下的文件进行排序
lists.sort(key=lambda  fn: os.path.getmtime(result_dir+"\\"+fn))
print('最新的文件为'+lists[-1])
file=os.path.join(result_dir,lists[-1])
print(file)