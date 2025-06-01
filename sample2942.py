words = input()
l = list(words.split())
n = len(l)
ch = input()
arr = []
for i in range(0,n):
    k = l[i]
    m=len(l[i])
    for j in range(0,m):
        if ch==k[j]:
            arr.append(i)
print(arr)