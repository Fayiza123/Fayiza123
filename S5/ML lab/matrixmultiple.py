r1 = int(input("Enter the number of rows of the first matrix:"))
c1 = int(input("Enter the number of columns of the first matrix:"))
r2 = int(input("Enter the number of rows of the second matrix:"))
c2 = int(input("Enter the number of columns of the second matrix:"))
        
if r1 != c2:
 	print("Matrix multplication is not possible.")
else:	
        print("the first matrix:")
        m1=[]
        for i in range(r1):
        	row=list(map(int ,input().split()))  
        	m1.append(row)    
        print("the second matrix:")
        m2=[]
        for i in range(r2):
        	row=list(map(int ,input().split()))  
        m2.append(row)
        result= []
        
        for i in range(r1):
        	row=[]
        	for j in range(c2):
        		s=0
        		for k in range(c1):
        			s+= m1[i][k] * m2[k][j]
        	row.append(s)
        	result.append(row)
        print("The product two matrices is:")
        for row in result:
        	print(*row)      		 			       
