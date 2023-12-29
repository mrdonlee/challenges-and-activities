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
