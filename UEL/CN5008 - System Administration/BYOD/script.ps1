# The function that displays the main menu.
function Display-Menu {
    Clear-Host

    Write-Host "========================================================"
    Write-Host "|                        MENU                          |"
    Write-Host "========================================================"
    Write-Host ""
    Write-Host "Please select a number corresponding to the task below:"
    Write-Host ""
    Write-Host "[1] Create single user:"
    Write-Host "[2] Create multiple user:"
    Write-Host "[3] Edit user details:"
    Write-Host "[4] Delete user:"
    Write-Host "[0] Exit"
    Write-Host ""
    return (Read-Host "Please select an option") # Gets input from the user and returns the input.
}

# The function used to display edit options for a specified user.
function Display-EditMenu {
    Clear-Host

    Write-Host "========================================================"
    Write-Host "|                CHANGE USER DETAILS                   |"
    Write-Host "========================================================"
    Write-Host ""
    Write-Host "Please select an option for modification:"
    Write-Host ""
    Write-Host "[1] Change full name:"
    Write-Host "[2] Change password:"
    Write-Host "[0] Exit"
    Write-Host ""
    $modOption = Read-Host "Please select an option" # Gets input from the user and store in modOption variable.

    # The loop which will execute commands based on the option given by the user.
    while ($true) {
        switch ($modOption) {
            # If 0 is chosen the program will exit.
            0 {
                Write-Host "Exiting..."
                return
            }

            # If 1 is chosen the user will be prompted to enter a new full name and the name of the user specified will be changed.
            1 {
                $fullName = Read-Host "Enter the new full name"
                net user $username /fullname:"$fullName"
                Write-Host "Full name changed to $fullName" # A message will be displayed upon successful change of the name.
                return
            }

            # If 2 is chosen the user will be prompted to enter a new password for the specified user.
            2 {
                $username | Set-LocalUser -Password (Read-Host -AsSecureString "Please type in your new password")
                Write-Host "Password changed successfully..."
                return
            }

            # If no number between 0-2 is chosen, the invalid message will be displayed and user will be prompted for a valid input again.
            default {
                Write-Host "Invalid input..."
                $modOption = Read-Host "Enter 1 or 2 for option, or 0 to quit"
            }
        }
    }
}

# The function that contains the main program script which runs when executed.
function Main {
    while ($true) {
        $option = Display-Menu # Calls the function and stores the return value in option variable..

        # Switch statement to execute funtions based on the selected option.
        switch ($option) {
            # If 0 is chosen, the program will exit showing the message.
            0 {
                Write-Host "Exiting..."
                return
            }

            # If 1 is chosen, the program will check if the user exist and then create the user if not.
            1 {
                $username = Read-Host "Enter username"
                if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                    Write-Host "The user already exists." # If the user doesn't exit, this message will be shown.
                    return
                } else {
                    New-LocalUser -Name $username # Created a new user if the user doesn't exist.
                }
                return
            }

            # If 2 the user will be prompted for number of user accounts to add.
            2 {
                $user_count = Read-Host "Number of user accounts"

                # The user is then prompted for usernames of all the users to be added in a loop.
                for ($i = 0; $i -lt $user_count; $i++) {
                    $username = Read-Host "Enter username of user $($i + 1)"
                    New-LocalUser -Name $username # All the users specified will be added to the system one by one.
                }
                return
            }

            # If 3 is chosen, the program will chek if the user exist and will display the menu if yes.
            3 {
                $username = Read-Host "Enter username of the user to modify"
                if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                    Display-EditMenu
                } else {
                    Write-Host "The user you specified does not exist." # If the user doesn't exist, the message will be displayed.
                }
                return
            }

            # If 4 is chosen, the user will be prompted for a user to be deleted.
            4 {
                $username = Read-Host "Enter the username of the user to be deleted"

                # This user will then be deleted from the system if exist and message will be printed if not.
                if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                    Remove-LocalUser -Name $username
                } else {
                    Write-Host "The user you specified does not exist."
                }
                return
            }

            # If any other option is chosen, then the invalid message will be shown and the user will be asked for a valid input.
            default {
                Write-Host "Invalid input."
                $option = Read-Host "Please enter a number between 1-4 or 0 to quit"
            }
        }
    }
}

main # Calls the main function.
