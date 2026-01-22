for _ in range(int(input())):
    s = input()
    n = len(s)
    if n > 10:
        print(s[0],n-2,s[n-1],sep="")
    else:
        print(s)