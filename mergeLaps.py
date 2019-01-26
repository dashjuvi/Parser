def merge(intervals):
    # Time Complexity: O(nlogn) | Space Complexity: O(n)
    if not len(intervals):
        return intervals
    intervals = sorted(intervals, key=lambda x: x[0])
    newInterval = [intervals[0]]
    previous = newInterval[0]
    for i in range(1, len(intervals)):
        current = intervals[i]
        if current[0] <= previous[1] and current[1] >= previous[1]:
            previous[1] = current[1]
        elif current[0] <= previous[1] and current[1] < previous[1]:
            continue
        else:
            newInterval.append(current)
            previous = current
    return newInterval


intervals = [[1, 3], [2, 3], [8, 10], [15, 18]]
print(merge(intervals))
