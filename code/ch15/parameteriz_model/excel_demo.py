import xlrd
from datetime import date, datetime


def read_excel():
    # 打开文件
    workbook = xlrd.open_workbook('D:\\demo\\userdata.xlsx','r')
    # 获取所有sheet
    print( workbook.sheet_names() )
    sheet2_name = workbook.sheet_names()[0]
    # 根据sheet索引或者名称获取sheet内容
    sheet1 = workbook.sheet_by_index(0)  # sheet索引从0开始
    # sheet1 = workbook.sheet_by_name('Sheet1')

    # sheet的名称，行数，列数
    # print(sheet1.name, sheet1.nrows, sheet1.ncols)

    # 获取整行和整列的值（数组）
    rows = sheet1.row_values(0)  # 获取第1行内容
    cols = sheet1.col_values(1)  # 获取第2列内容
    # print(rows)
    # print(cols)

    nrows =sheet1.nrows
    print(nrows)
    for i in range(nrows):
        print(sheet1.row_values(i))



if __name__ == '__main__':
    read_excel()