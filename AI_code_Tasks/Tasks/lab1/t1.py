def cafe_menu():
    """Displays a cafe menu and asks for user input."""
    print("--- Cafe Menu ---")
    print("1. Cofee")
    print("2. Beef Pulao ")
    print("3. Chicken Nihari ")

    choice = input("Enter the number of your choice: ")
    choice = int(choice)

    if choice == 1:
        print("You ordered Cofee")
    elif choice ==2:
        print("You ordered Beef Pulao")
    elif choice == 3:
        print("You ordered Nihari")
    else:
        print("Item not found")

cafe_menu()
