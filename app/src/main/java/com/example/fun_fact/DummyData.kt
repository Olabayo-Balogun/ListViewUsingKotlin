package com.example.fun_fact

object DummyData {
    val funFacts = listOf<FactModel>(
        FactModel(
            name = "Java",
            R.drawable.java_logo,
            fact = "The language was previously called Oak after an oak tree that stood outside Gosling's office. Later the project "
        ),
        FactModel(
            name = "Javascript",
            R.drawable.js_logo,
            fact = "The name Javascript came from Netscape's support of Java applets within it's browser"
        ),
        FactModel(
            name = "Kotlin",
            R.drawable.kotlin_logo,
            fact = "The name comes from Kotlin island, near St. Petersburg,Andrey Breslav mentioned that the team decided to name it after an island"
        ),
        FactModel(
            name = "PHP",
            R.drawable.php_logo,
            fact = "PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preparation "
        ),
        FactModel(
            name = "Python",
            R.drawable.python_logo,
            fact = "Why is it called Python? ...When he began implementing Python, Guido van Rossum was also reading the published scripts from ${"Monty Python's Flying Circus"}, a BBC comedy series from the 1970s. Van Rossum thought he needed a name that was short, unique and slightly mysterious, so he decided to call the language Python"
        )
    )
}