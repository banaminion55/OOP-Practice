class Main {
    public static void main(String[] args) {

        BaseballPlayerList myList = new BaseballPlayerList();

        myList.add("Mike Trout", "Angels", .311);
        myList.add("Garrett Anderson", "Angels", .333);
        myList.add("Wally Joyner", "Angels", .289);
        myList.add("David Fletcher", "Angels", .301);
        myList.add("Justin Upton", "Angels", .278);

        myList.add("Justin Turner", "Dodgers", .303);
        myList.add("Corey Seager", "Dodgers", .271);
        myList.add("Code Bellinger", "Dodgers", .265);
        myList.add("Chris Taylor", "Dodgers", .300);
        myList.add("Mookie Betts", "Dodgers", .321);

        System.out.println(myList.getHighestAvg("Angels"));
        System.out.println(myList.getHighestAvg("Dodgers"));


    }
}


//Distill a complicated system down to its most fundamental parts
//Applying the abstraction paradigm to the design of


/*
OOP design principle 1 - Abstraction (breaking up into pieces)
ADT (Abstract Data Type)

- Don't write god methods
- Write simple methods

OOP Design Principle 2 - Encapsulation (deeming methods private & hiding those pieces)
- Hide data inside the methods and classes
- Just say "act" instead of "moveupward"

OOP Design Principle 3 - Modularity
- Different components of a software system are divided into separate functional units

* Adaptibility (easily change COD from 6 v 6 to 12 v 12)

Project -




*/
