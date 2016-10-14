WinWait($CmdLine[1])

WinActive($CmdLine[1])
;Sleep(5000)
ControlFocus("File Upload","","Edit1")
Sleep(5000)
ControlSetText("File Upload","", "Edit1", "mispic.jpg")
Sleep(5000)
ControlClick("File Upload", "", "Button1")