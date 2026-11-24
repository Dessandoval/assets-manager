# p.55 question
When adding the Cash class, the compiler threw an error because `Asset` contains an abstract method `getValue()`, meaning any concrete child class must implement it.

### Options Considered
1. Implement `getValue()` in Cash (the choice we made so `Cash` can be instantiated and return its value).
2. Make `Cash` abstract as well (which would prevent us from ever creating cash objects in our list).
3. Remove the `abstract` keyword from `Asset`.

### Why We Chose Option 1
I chose to implement `getValue()` directly in `Cash` because `Cash` is a concrete asset we actually create and store in our collection, and it needs a specific value calculation matching its current worth.


