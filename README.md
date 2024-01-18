### Storage

*What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?*
*Think about the method calls in main - does trimToSize() exist in LinkedList?*
*Should Main know about what concrete type of List Storage provides?*

As it is in the original code, the implementation of List can't be easily changed - in main it is specified as an arraylist and the method trimToSize() is specific to ArrayList. To design a program that is flexible and well encapsulated main shouldn't have to know what concrete type of list Storage provides. Main should know that Storage is a class that focuses on storing data, not *the way* it works.

### Inheritance

*Make a UML diagram showing the inheritance tree (you don't need to be specific)*

                    +-------------+
                    |  Employee   |
                    +-------------+
                          |
          +---------------------------+
          |                           |
   +-------------+            +-------------+
   |  Engineer   |            |  Manager    |
   +-------------+            +-------------+

*Is it possible in this design for an Engineer to also become a Manager?*

No. Both Engineer and Manager are subclasses of Employee, but there is no direct inheritance-relationship between them. This is the reason to use composition instead of inheritance - inheritance locks the design because a class can only extend *one* class at a time.

*If you want a removeRole(Role) method, how do you have to change the Role class?*

For a role to be deleted one must first be able to find the role to delete. In other words there must be a way to search for the role and therefore the Role class would have to implement an equals-method.