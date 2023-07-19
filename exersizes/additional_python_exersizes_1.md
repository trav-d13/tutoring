# Additional Python Exersizes

1. Given a list, write the code to swap the first and last element of the list. The code must work for a list of any 
size and order
```angular2html
list_original = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
expected output: [10, 2, 3, 4, 5, 6, 7, 8, 9, 1]
```

2. Please perform the following slices on the below list:
      - Print elements from the beginning to the first 'N' using slicing
      - Print every second element of the list in the reverse order

```angular2html
list = ['L', 'E', 'A', 'R', 'N', 'I', 'N', 'G', 'P', 'Y', 'T', 'H', 'O', 'N']

slicing_output = ['L', 'E', 'A', 'R', 'N']
reverse_output = ['N', 'H', 'Y', 'G', 'I', 'R', 'E']
```

3. Write python code to add a key and value to the below example dictionary. The key to be used is 55, and the value is 29

```angular2html
example_dictionary = {0: 10, 1: 20}
expected_output = {0: 10, 1: 20, 55: 29}
```

4. Write python code to check if a key already exists in a dictionary. The key you want to check is 'John' in the below example
   - Sub-question: Can there exist identical keys in the dicitonary? 
```
original_dictionary = {'Bob': 26, 'Sarah': 34, 'John':41, 'Mike': 19}
expected_output = True (key exists in the dictionary)
```

5. Write python code to get the maximum and minimum value from the example dictionary below. Print the key (name) and the value for the maximum and minimum

```
{'Bob': 26, 'Sarah': 34, 'John':41, 'Mike': 19, 'Kyle': 92, 'Rob': 72}
minimum: Mike 19
maximum: Kyle 92
```

6. Print the below list in reverse order using a for loop

```angular2html
list1 = [10, 20, 30, 40, 50]
expected_output = [50, 40, 30, 20, 10]
```

7. Using 2 for loops one after the other, write python code to print the following pattern

```angular2html
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
```

8. Write python code to print numbers from the below list if they satisfy the following conditions:
   - The number must be divisible by 5
   - If the number is greater than 150, skip it and move to the next number (look up `continue` statement in python)
   - If the number is greater than 500, stop the loop (look up `break` statement in Python)

```angular2html
numbers = [12, 75, 150, 180, 145, 525, 50]
expected_output:
    75
    150
    145
```