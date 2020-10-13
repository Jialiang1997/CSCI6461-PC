package com.alu;

import com.exception.RunInstructionException;
import com.memory.MCU;
import com.memory.Registers;

/**
 * 
 * All the instructions in this project should extend this abstract class.
 *
 */
public interface AbsInstruction {

    /**
     * 
     * execute the instruction
     * 
     * @param instruction
     *            instruction in binary String
     * @param registers
     * @param mcu
     * @throws RunInstructionException
     * 
     * 
     */
    void execute(String instruction, Registers registers, MCU mcu) throws RunInstructionException;

    /**
     * return a message that contains the execution message of an instruction.
     * eg. "LDR 3,0,31" or "Load register 3 with the contents of the memory
     * location 31". The writer of every instruction class should be responsible
     * for building such a string.
     * 
     * @return execution message
     * 
     * 
     */
    String getExecuteMessage();

}
