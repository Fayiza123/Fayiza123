li1= list(map(int,input("Enter the first list:").split()))
li2=list(map(int,input("Enter the second list:").split()))
print("union of the list =",list(set(li1) | set(li2)))
print("intersection of the list =",list(set(li1) & set(li2)))
