func maxArea(heights []int) int {
    l, r := 0, len(heights) - 1
    maxWater := 0

    for l < r {
        h := heights[l]
        if heights[r] < h {
            h = heights[r]
        }

        amount := (r-l) * h
        if maxWater < amount {
            maxWater = amount
        }

        if heights[l] < heights[r] {
            l++
        } else {
            r--
        }
    }

    return maxWater
}
