# import sys,datetime,fileInput

# now = datetime.datetime.now()
# currentTime = now.strftime("%d/%m/%Y, %H:%M:%S")
# stringToWrite="/**\n   Author is Rohan Jain \n   Created at "+currentTime+"\n**/"
# with open(sys.argv[1],"w") as fileToWrite:
#     fileToWrite.write(stringToWrite)


# with open()

# # fileToWrite.write(str(datetime.datetime.now()))
# # print("Author is  rohan jain" +sys.argv[1])
# # print(type(currentTime))

import os,sys
cwd = os.getcwd()
print(cwd)

fileName = sys.argv[1]

if os.path.isfile(fileName):
     print("Yes it exists")   

else :
    print("It does not exists")    