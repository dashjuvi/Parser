def bubbleSort(arr): 
    n = len(arr) 
      for i in range(n): 
          for j in range(0, n-i-1): 
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 
  
# test
arr = [64, 34, 2215, 12, 22, 131, 90] 
  
bubbleSort(arr) 
  
print ("Sorted array is:") 
for i in range(len(arr)): 
    print ("%d" %arr[i]),  
