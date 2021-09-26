#minimum cost of coloring blocks such that no two adjacent blocks have the same color


def minCost(cost):
    n = len(cost)
    for i in range (1, n):
        cost[i][0] += min(cost[i-1][1], cost[i-1][2])
        cost[i][1] += min(cost[i-1][0], cost[i-1][2])
        cost[i][2] += min(cost[i-1][1], cost[i-1][0])
    return min (cost[n-1][0], cost[n-1][1], cost[n-1][2])

print(minCost([[1,100,10],[2,100,200]]))
