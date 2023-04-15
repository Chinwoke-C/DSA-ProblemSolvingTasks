
    let largest = 0;
    let secondLargest = 0;
    sentinel = -1
    user_input = console.log("Enter a number or press -1 to quit")
    while (user_input != sentinel){
        alert(user_input)
        user_input = prompt("Enter a number or press -1 to quit");
    }
    if (user_input > largest){
        secondLargest = largest
        largest = user_input
    }
    else if (user_input > secondLargest) {
        secondLargest = user_input 
           
     };
    

    console.log("The second largest number is: " + secondLargest);
    
