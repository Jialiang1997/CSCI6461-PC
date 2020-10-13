package com.alu;

import com.exception.RunInstructionException;
import com.memory.MCU;
import com.memory.Registers;

public class HLT implements AbsInstruction {

    @Override
    public void execute(String instruction, Registers registers, MCU mcu) throws RunInstructionException {
        if (instruction.substring(8, 16).equals("00000000")) {
            System.out.println("HALT!");
        }
    }

    @Override
    public String getExecuteMessage() {
        return "HALT";
    }

}
