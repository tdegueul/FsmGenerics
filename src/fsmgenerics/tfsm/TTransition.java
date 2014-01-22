package fsmgenerics.tfsm ;

import fsmgenerics.ITransition ;

public class TTransition implements ITransition<TFsm, TState, TTransition>
{
	String input ;
	String output ;
	TState source ;
	TState target ;
	int time ;
	
	@Override
	public String getInput() {
		return input ;
	}

	@Override
	public void setInput(String s) {
		input = s ;
	}

	@Override
	public String getOutput() {
		return output ;
	}

	@Override
	public void setOutput(String s) {
		output = s ;
	}

	@Override
	public TState getSource() {
		return source ;
	}

	@Override
	public void setSource(TState s) {
		source = s ;
	}

	@Override
	public TState getTarget() {
		return target ;
	}

	@Override
	public void setTarget(TState s) {
		target = s ;
	}
	
	public int getTime() {
		return time ;
	}
	
	public void setTime(int i) {
		time = i ;
	}
}
