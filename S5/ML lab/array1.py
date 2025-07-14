import numpy as np
import pandas as pd

 
arr1 = np.array([[1,6012],[2,7079],[3,6886],[4,7230],[5,4598],[6,5564],[7,6971],[8,7763],[9,8032],[10,9569]])
arr1[:,1] += 2000
df = pd.DataFrame(arr1,columns=['day_number','steps_walked'])
print(df)

steps = df[df['steps_walked']>9000]
print(steps)

 
