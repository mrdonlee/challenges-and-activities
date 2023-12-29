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
    $mod_option = Read-Host "Please select an option"

    while ($true) {
        switch ($mod_option) {
            0 {
                Write-Host "Exiting..."
                break
            }
            1 {
                $full_name = Read-Host "Enter the new full name"
                net user $username /fullname:"$full_name"
                Write-Host "Full name changed to $full_name"
                break
            }
            2 {
                Write-Host "Please type in your new password"
                $username | Set-LocalUser -Password (Read-Host -AsSecureString)
                break
            }
            default {
                Write-Host "Invalid input..."
                $mod_option = Read-Host "Enter 1 or 2 for option, or 0 to quit"
            }
        }
    }
}
