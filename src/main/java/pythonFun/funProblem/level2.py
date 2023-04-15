def concat_sort():
    list1 = [1, 3, 4, 5]
    list2 = [2, 6, 7, 8]

    merge_list = []
    i, j = 0, 0
    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            merge_list.append(list1[i])
            i += 1
        else:
            merge_list.append(list2[j])
            j += 1
    merge_list += list1[i:]
    merge_list += list2[j:]

    print("merged and sorted array is ", merge_list)


if __name__ == '__main__':
    concat_sort()
