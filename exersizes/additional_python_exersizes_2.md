## Additional Python Exersizes

Sources:
- ChatGPT generated
- https://pynative.com/python-dictionary-exercise-with-solutions/

### Exersize 1
Exercise 1: Average of Numbers
Write a program that takes a list of numbers as input from the user and calculates the average of all the numbers. 
Use casting to convert user input to numbers. \
**Hint:** To create a list of user inputs consider placing the `input()` method within a loop...

```
input = 10 20 30 40 50
Output = Average is 30
```

### Exersize 2
Write a program that takes a string as input from the user and counts the frequency of each word in the string. 
Store the results in a dictionary and display the word frequencies.

```
Input sentence: "This is a simple sentence. This is another sentence"
Output: {'This': 2, 'is': 2, 'a': 1, 'simple': 1, 'sentence.': 2, 'another': 1}
```

### Exersize 3
Write a program that takes a string as input from the user and checks if it is a 
palindrome (reads the same forwards and backwards). Ignore spaces and punctuation while checking.

```
Input: "radar"
Output: True

Input: "hello"
Output: False
```

### Exersize 4
Create a program that simulates a simple shopping cart. Use a dictionary to store the items and their prices. 
Allow the user to add items to the cart, remove items from the cart, and display the total price of all items in the cart.

```
groceries = {"Eggs": 10, "Bacon": 15, "Chocolate": 23, "Bananas": 7, "Mango": 12}

1. Fred would like to purchase 2 packets of Eggs, and 3 chocolate bars. What is his total cost of groceries? 
2. James purchases a packet of Bacon, and a Bananas and Mango. But he forgot, he already has Bacon at home, so he removes it from the cart. How much does Hames's groceries cost?

Output 1: 89
Output 2: 19
```

### Exersize 5
Convert two lists into a dictionary.
```
Input:
dict1 = {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
dict2 = {'Thirty': 30, 'Fourty': 40, 'Fifty': 50}

Output: {'Ten': 10, 'Twenty': 20, 'Thirty': 30, 'Fourty': 40, 'Fifty': 50}
```

### Exersize 6
Print the value of the key "history" from the below dictionary

```
Input:

sampleDict = {
    "class": {
        "student": {
            "name": "Mike",
            "marks": {
                "physics": 70,
                "history": 80
            }
        }
    }
}

Output:80
```