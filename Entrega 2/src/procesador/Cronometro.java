package procesador;

import java.util.ArrayList;
import java.swingx;

public class Cronometro {
	private String tiempo;
	private Registro_de_tiempo registro_tiempo;
	private String titulo;
	private ArrayList<Registro_de_tiempo> registro_de_tiempos;
	
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.hora_de_inicio = hora_de_inicio;
	this.hora_de_finalizacion = hora_de_finalizacion;
	this.participante = participante;
	this.tipos_de_actividades = tipos_de_actividades;
	this.actividades = actividades;
	
	error := c.Login(context.Background(), username, password)
			if error != 0 {
			    t.Fatalf("falló la creación del tiempo designado", error)
			}
	
	ListLines Off
	SetBatchLines, -1
	SetKeyDelay, -1, -1
	SetWinDelay, -1
	SetControlDelay, -1
	SendMode Input
	Process, Priority, %PID%, AboveNormal
	CoordMode, Mouse, Screen


	  IniRead, CronometerHotkey1, settings.ini, settings, CronometerHotkey1, ""
	  IniRead, CronometerHotkey2, settings.ini, settings, CronometerHotkey2, ""
	  IniRead, CronometerHotkey3, settings.ini, settings, CronometerHotkey3, ""
	  IniRead, CronometerHotkey4, settings.ini, settings, CronometerHotkey4, ""
	  IniRead, CronometerHotkey5, settings.ini, settings, CronometerHotkey5, ""
	  IniRead, CronometerHotkey6, settings.ini, settings, CronometerHotkey6, ""
	  IniRead, CronometerSeconds, settings.ini, settings, CronometerSeconds, 2
	  IniRead, CronometerMessage, settings.ini, settings, CronometerMessage, @@@@@
	  IniRead, CronometerMessageDelay, settings.ini, settings, CronometerMessageDelay, 200
	  IniRead, CronometerMessageColor1, settings.ini, settings, CronometerMessageColor1, Lime
	  IniRead, CronometerMessageColor2, settings.ini, settings, CronometerMessageColor2, Red
	  

	    Menu, Tray, Icon, %A_ScriptDir%\Files\Compass.ico

	    Gui, Add, Text, x10 y+10, Seconds to count:
	    Gui, Add, Edit, x100 yp-3 vCronometerSeconds w38, %CronometerSeconds%
	    

	    Gui, Add, Text, x10 yp+28, End message:
	    Gui, Add, Edit, xp+72 yp-3 vCronometerMessage w113, %CronometerMessage%

	    Gui, Add, Text, x10 yp+28, Message time on screen(ms):
	    Gui, Add, Edit, xp+145 yp-3 vCronometerMessageDelay w40, %CronometerMessageDelay%

	    Gui, Add, Text, x10 yp+28, Message < 1 second color:
	    Gui, Add, ComboBox, xp+135 yp-3 vCronometerMessageColor1 w50, Lime|Green|Yellow|Blue|Red|Purple|Gray|White|Black
	    GuiControl, ChooseString, CronometerMessageColor1, %CronometerMessageColor1%

	    Gui, Add, Text, x10 yp+28, Message > 1 second color:
	    Gui, Add, ComboBox, xp+135 yp-3 vCronometerMessageColor2 w50, Lime|Green|Yellow|Blue|Red|Purple|Gray|White|Black
	    GuiControl, ChooseString, CronometerMessageColor2, %CronometerMessageColor2%

	    Gui, Add, Text, x10 yp+25, Hotkey to start cronometer
	    Gui, Add, ComboBox, x10 w50 vCronometerHotkey1, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey1, %CronometerHotkey1%

	    Gui, Add, Text, xp+55 yp+2, or

	    Gui, Add, ComboBox, xp+14 yp-2 w50 vCronometerHotkey2, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey2, %CronometerHotkey2%

	    Gui, Add, Text, xp+55 yp+2, or

	    Gui, Add, ComboBox, xp+14 yp-2 w50 vCronometerHotkey3, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey3, %CronometerHotkey3%
	    
	    Gui, Add, ComboBox, x10 yp+35 w50 vCronometerHotkey4, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey4, %CronometerHotkey4%

	    Gui, Add, Text, xp+55 yp+2, or

	    Gui, Add, ComboBox, xp+14 yp-2 w50 vCronometerHotkey5, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey5, %CronometerHotkey5%

	    Gui, Add, Text, xp+55 yp+2, or

	    Gui, Add, ComboBox, xp+14 yp-2 w50 vCronometerHotkey6, %A_Space%|a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|x|w|y|z|1|2|3|4|5|6|7|8|9|F1|F2|F3|F4|F5|F6|F7|F8|F9|F10|F11|F12|Numpad0|Numpad1|Numpad2|Numpad3|Numpad4|Numpad5|Numpad6|Numpad7|Numpad8|Numpad9
	    GuiControl, ChooseString, CronometerHotkey6, %CronometerHotkey6%


	    Gui, Add, Button, x67 yp+30 h25 gStart, Start
	    Gui, Add, Button, xp+40 h25 gClose, Stop


	    Gui, Show, w210 h250, Cronometer
	Return


	Start:
	{
	    Gui, Submit, NoHide
	    IniWrite, %CronometerHotkey1%, settings.ini, settings, CronometerHotkey1
	    IniWrite, %CronometerHotkey2%, settings.ini, settings, CronometerHotkey2  
	    IniWrite, %CronometerHotkey3%, settings.ini, settings, CronometerHotkey3 
	    IniWrite, %CronometerHotkey4%, settings.ini, settings, CronometerHotkey4
	    IniWrite, %CronometerHotkey5%, settings.ini, settings, CronometerHotkey5 
	    IniWrite, %CronometerHotkey6%, settings.ini, settings, CronometerHotkey6 
	    IniWrite, %CronometerSeconds%, settings.ini, settings, CronometerSeconds 
	    IniWrite, %CronometerMessage%, settings.ini, settings, CronometerMessage 
	    IniWrite, %CronometerMessageDelay%, settings.ini, settings, CronometerMessageDelay
	    IniWrite, %CronometerMessageColor1%, settings.ini, settings, CronometerMessageColor1 
	    IniWrite, %CronometerMessageColor2%, settings.ini, settings, CronometerMessageColor2 
	    Run, %A_ScriptDir%\Files\CronometerApp.exe
	    ;Run, %A_ScriptDir%\Files\CronometerApp.ahk
	    Return
	}
}
