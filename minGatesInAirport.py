import datetime


def difference (land, takeoff):

    land = str(land)
    takeoff = str(takeoff)
    if (len(land)  > 3):
        lh = int(land[0:2])
        lm = int(land[2:4])
    else:
        lh = int(land[0])
        lm = int(land[1:3])
    if (len(takeoff)  > 3):
        th = int(takeoff[0:2])
        tm = int(takeoff[2:4])
    else:
        th = int(takeoff[0])
        tm = int(takeoff[1:3])
    a = datetime.datetime(2017, 8, 30, th, tm)
    b = datetime.datetime(2017, 8, 30, lh, lm)

    c = a-b

    return(c.total_seconds()//60)

def minGates(landingTimes, takeOffTimes, maxWaitTime, initialPlanes):
    ans = initialPlanes

    c = initialPlanes
    i = j = 0
    waiting = 0

    while (i < len(landingTimes) and j < len(takeOffTimes)):
        if (landingTimes[i] < takeOffTimes[j]):
            print(landingTimes[i], takeOffTimes[j])
            if (difference(landingTimes[i], takeOffTimes[j]) > maxWaitTime):
                i += 1
                c += 1
                if (c > ans):
                    ans = c
            else:
                waiting += 1
                i+=1
        else:
            if (waiting > 0):
                waiting -= 1
            else:
                c -= 1
            j += 1
    return ans
                
    
print(minGates([630,645,730,1100],[700,845,1015,1130],10,1))
