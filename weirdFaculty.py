def weirdFaculty (scores):
    for i in range (len(scores)):
        if scores[i] == 0:
            scores[i] = -1
    total = sum(scores)
    sub = 0
    for i in range (len(scores)):
        if sub > total:
            return i
        total -= scores[i]
        sub += scores[i]


print(weirdFaculty([1,0,0,1,0]))
