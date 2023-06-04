"""Use pandas to read data the Excel file

   Print the number of rows and columns
   Print the data in the emails column only
   Sort the data based on FirstName in ascending order and print the data


   Hint: You can use DataFrame.shape to get the number of rows and columns"""


import pandas

dataframe = pandas.read_excel('../resources/Act20.xlsx')

print(dataframe)


print("====================================")
print("Number of rows and columns are", dataframe.shape)

# Print the data in the emails column only
print("====================================")
print("Emails are")
print(dataframe['Email'])

# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data are")
print(dataframe.sort_values('Name'))