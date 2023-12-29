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
    $option = Read-Host "Please select an option" # Gets input from the user and store in option variable.
}

# The function used to display edit options for a specified user.
function DisplayEditMenu {
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
    $mod_option = Read-Host "Please select an option" # Gets input from the user and store in mod_option variable.

    # The loop which will execute commands based on the option given by the user.
    while ($true) {
        switch ($mod_option) {
            # If 0 is chosen the program will exit.
            0 {
                Write-Host "Exiting..."
                break
            }

            # If 1 is chosen the user will be prompted to enter a new full name and the name of the user specified will be changed.
            1 {
                $full_name = Read-Host "Enter the new full name"
                net user $username /fullname:"$full_name"
                Write-Host "Full name changed to $full_name" # A message will be displayed upon successful change of the name.
                break
            }

            # If 2 is chosen the user will be prompted to enter a new password for the specified user.
            2 {
                Write-Host "Please type in your new password"
                $username | Set-LocalUser -Password (Read-Host -AsSecureString)
                break
            }

            # If no number between 0-2 is chosen, the invalid message will be displayed and user will be prompted for a valid input again.
            default {
                Write-Host "Invalid input..."
                $mod_option = Read-Host "Enter 1 or 2 for option, or 0 to quit"
            }
        }
    }
}

# The main program script which runs when executed.
while ($true) {
    Display-Menu

    switch ($option) {
        0 {
            Write-Host "Exiting..."
            break
        }
        1 {
            $username = Read-Host "Enter username"
            if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                Write-Host "The user already exists."
                break
            } else {
                New-LocalUser -Name $username
            }
            break
        }
        2 {
            $user_count = Read-Host "Number of user accounts"
            for ($i = 0; $i -lt $user_count; $i++) {
                $username = Read-Host "Enter username of user $i"
                New-LocalUser -Name $username
            }
            break
        }
        3 {
            $username = Read-Host "Enter username of the user to modify"
            if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                Display-Edit-Menu
            } else {
                Write-Host "The user you specified does not exist."
            }
            break
        }
        4 {
            $username = Read-Host "Enter the username of the user to be deleted"
            if (Get-LocalUser -Name $username -ErrorAction SilentlyContinue) {
                Remove-LocalUser -Name $username -Force
            } else {
                Write-Host "The user you specified does not exist."
            }
            break
        }
        default {
            Write-Host "Invalid input."
            $option = Read-Host "Please enter a number between 1-4 or 0 to quit"
        }
    }
}
