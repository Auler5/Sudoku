/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.File;
import java.util.Scanner;
import javafx.event.ActionEvent;

/**
 * An abstract class which sets all the global variables.
 * @author Nafis
 */
public class Intermediate
{
    public static long MM, SS;
    public static boolean new_record;
    public static int level, mode, levels_per_mode = 6;
    public static boolean all_loaded = false;
    public static int[][][] alllevels = new int[50][9][9];
    public static int[] alltimes = new int[50];
    public static ActionEvent growthstatsevent;
    
    private void Intermediate() {}
}
