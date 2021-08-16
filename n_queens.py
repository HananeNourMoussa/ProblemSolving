#backtracking solution to the n-queens problem


global n

n = 8

def printSolution(board):
    for i in range (n):
        for j in range(n):
            print(board[i][j], end = ' ')
        print()

def isSafe (board, row, col):
    #check rows on the left side
    for j in range(col):
        if board[row][j] == 1:
            return False
    #check upper dioganol on left side
    for i, j in zip(range(row, -1, -1), range(col, -1,-1)):
        if board[i][j] == 1:
            return False
    for i, j in zip(range(row, n, 1), range(col, -1, -1)):
        if board[i][j] == 1:
            return False
    return True

def solveNqueenUtil(board, col):
    if col == n:
        return True

    for i in range(n):
        if isSafe(board, i, col):
            board[i][col] = 1

            if (solveNqueenUtil(board, col+1) == True):
                return True
            board[i][col] = 0
    return False

def solveNqueen():
    #board = [[0]*n]*n
    board = [[0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0],
             [0,0,0,0,0,0,0,0]]
            
    print('Board:')
    printSolution(board) 
    if solveNqueenUtil(board, 0) == False:
        print('No Solution')
        return
    print('Solution:')
    printSolution(board)
    





solveNqueen()
