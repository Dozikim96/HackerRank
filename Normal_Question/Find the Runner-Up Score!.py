if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    # 1. Convert to a set to remove duplicates (e.g., [2, 3, 6, 6, 5] -> {2, 3, 6, 5})
    unique_scores = set(arr)
    
    # 2. Convert back to a list and sort it
    sorted_scores = sorted(list(unique_scores))
    
    # 3. The runner-up is the second to last element
    print(sorted_scores[-2])
