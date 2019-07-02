import fileinput,sys,shutil,os,datetime
cwd = os.getcwd()
print(cwd)

fileName = sys.argv[1]
if sys.argv[1].split(".")[1] == "java":
        
    if os.path.isfile(fileName):
        print("Choose other name the file "+str(sys.argv[1]+" exists."))   

    else :
        print("Creating "+sys.argv[1]+" .....")    
        now = datetime.datetime.now()
        currentTime = now.strftime("%d/%m/%Y, %H:%M:%S")
        stringToWrite="/**\n   Author is Rohan Jain \n   Created at "+currentTime+"\n**/\n\n"
        with open(sys.argv[1],"w") as fileToWrite:
            fileToWrite.write(stringToWrite)

        filename = sys.argv[1]
        # shutil.copyfile("defaultStructure.txt",filename)

                            # ---------------------************************---------------------------------

        with open("defaultStructure.txt") as fileOne:
            with open(sys.argv[1],"a") as fileTwo:
                for line in fileOne:
                    fileTwo.write(line)

                            # ---------------------************************---------------------------------
        className =filename.split('.')[0]
        fileObject = fileinput.FileInput(filename, inplace=True) 
        for line in fileObject:
            line =line.replace("$$",className)
            print(line,end='')
        print("File "+sys.argv[1]+" created")    
else:
    print("File extension should be java.\nOnly java file can be created. ")
