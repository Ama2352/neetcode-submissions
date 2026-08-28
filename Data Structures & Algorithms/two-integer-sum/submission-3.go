func twoSum(nums []int, target int) []int {
    m := make(map[int]int)
    for i, num := range nums {
        diff := target - num
        if idx, found := m[diff]; found {
            return []int {idx, i}
        }
        m[num] = i
    }
    return nil
}
