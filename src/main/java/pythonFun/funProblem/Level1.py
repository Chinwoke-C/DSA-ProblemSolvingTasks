import random


def greet():
    print('Hello World')


def find_second_largest():
    largest = float('-inf')
    second_largest = float('-inf')
    sentinel = -1
    user_input = int(input("Enter a number or press -1 to quit"))
    while user_input != sentinel:
        print(user_input)
        user_input = int(input("Enter a number or press -1 to quit"))
        if user_input > largest:
            second_largest = largest
            largest = user_input
        elif user_input > second_largest:
            second_largest = user_input

    print("The second largest number is:", second_largest)


def print_word_new_line():
    word = "SEMICOLON"
    for letter in word:
        print(letter)


def print_two_new_line():
    word = "VENTURES"
    for letter in range(0, len(word), 2):
        print(word[letter:letter + 2])


def find_occurrence():
    word = "Mississippi"
    number_of_s = 0
    number_of_i = 0
    for letter in word:
        if letter == "s":
            number_of_s += 1
        if letter == "i":
            number_of_i += 1
    print("the number of occurrence of character 's' is ", number_of_s)
    print("the number of occurrence of character 'i' is ", number_of_s)


def common_divisor():
    num = 0
    for i in range(1, 31):
        if i % 3 == 0:
            num += i
    print("The sum of integers between 1 and 30 that are divisible by 3 is:", num)


def birthday_guess():
    number = 3
    while True:
        print("Guess my day of birthday")
        guess = int(input("Enter your guess: "))
        if guess != number:
            print("Incorrect guess")
            guess = +1
        else:
            print("Correct guess")
            break


if __name__ == "__main__":
    greet()
    # find_second_largest()
    print_word_new_line()
    print_two_new_line()
    find_occurrence()
    common_divisor()
    birthday_guess()
