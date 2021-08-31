#printing all subsequences in an array

def subsequences (arr, n, index, subseq):
    if (index == n):
        print(subseq)
        return
    subsequences(arr, n, index+1, subseq)
    subsequences(arr, n, index+1, subseq + [arr[index]])


subsequences([1,2,3,4], 4, 0, [])
