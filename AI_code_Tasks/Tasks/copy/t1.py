def cafe_menu():
    """Displays a cafe menu and asks for user input."""
    print("--- Cafe Menuu ---")
    print("1. Cofee")
    print("2.  Pulao ")
    print("3.  Nihari ")

    choice = input("Enter the number of your choice: ")
    choice = int(choice)

    if choice == 1:
        print("You ordered Cofee")
    elif choice ==2:
        print("You ordered  Pulao")
    elif choice == 3:
        print("You  Nihari")
    else:
        print("Item not found")

cafe_menu()
