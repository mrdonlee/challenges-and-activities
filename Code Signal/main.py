def solution(a):
    
    if len(a) == 1:
        return True
    
    b = []
    
    for i in range(len(a)):
        
        if i % 2 == 0:
            b.append(a[i // 2])
            
        else:
            b.append(a[- (i // 2 + 1)])
            
    print(a)
    print(b)

    for i in range(len(b) - 1):
        
        if b[i] > b[i +1]:
            print(b[i], b[i + 1])
            return False
            
    return True


a = [1, 4, 5, 6, 3]

print(solution(a))
