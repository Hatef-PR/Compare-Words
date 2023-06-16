package main

import "fmt"

func main() {
	var word1, word2 string
	fmt.Println("Please enter 1st word:")
	fmt.Scanln(&word1)
	fmt.Println("Please enter 2nd word:")
	fmt.Scanln(&word2)
	fmt.Println(compareWords(word1, word2))
}
// This method checks two strings are exactly same
func compareWords(a, b string) bool {
	var flag = true
	if len(a) != len(b) {
		return !flag
	} else {
		for i := 0; i < len(a); i++ {
			if a[i] != b[i] {
				flag = false
				break
			}
		}
	}
	return flag
}