package fsmgenerics.tfsm ;

import fsmgenerics.Fsm_MT ;
import fsmgenerics.IFsm;
import fsmgenerics.IState;
import fsmgenerics.ITransition;

public class TFsm_MM implements Fsm_MT<TFsm, TState, TTransition>
{
	TFsm root ;
	
	@Override
	public TFsm getRoot() {
		return root ;
	}
	
	@Override
	public void setRoot(TFsm f) {
		root = f ;
	}
	
	@Override
	public void print() {
		for (TState s : root.getOwnedState()) {
			System.out.println("TState " + s.getName()) ;
			
			for (TTransition t : s.getOutgoingTransition()) {
				System.out.println("TTransition " + t.getInput() + "(" + t.getOutput() + ")") ;
			}
		}
		
		System.out.println() ;
	}
	
	public static <F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>> Fsm_MT<F, S, T> combine(Fsm_MT<F, S, T> m1, Fsm_MT<F, S, T> m2) {
		return m1 ;
	}
	
	public static void main(String[] args) {
		/*Fsm_MM m1 = new Fsm_MM() ;
		TFsm root1 = new TFsm() ;
		TState s1 = new TState() ;
		s1.setName("s1") ;
		s1.setOwningFsm(root1) ;
		TState s2 = new TState() ;
		s2.setName("s2") ;
		s2.setOwningFsm(root1) ;
		TTransition t1 = new TTransition() ;
		t1.setSource(s1) ;
		t1.setTarget(s2) ;
		s1.getOugoingTransition().add(t1) ;
		s2.getIncomingTransition().add(t1) ;
		root1.getOwnedState().add(s1) ;
		root1.getOwnedState().add(s2) ;
		root1.setInitialState(s1) ;
		root1.getFinalState().add(s2) ;
		m1.setRoot(root1) ;
		
		Fsm_MM m2 = new Fsm_MM() ;
		TFsm root2 = new TFsm() ;
		TState s3 = new TState() ;
		s3.setName("s3") ;
		s3.setOwningFsm(root1) ;
		TState s4 = new TState() ;
		s4.setName("s4") ;
		s4.setOwningFsm(root2) ;
		TTransition t2 = new TTransition() ;
		t2.setSource(s3) ;
		t2.setTarget(s4) ;
		s1.getOugoingTransition().add(t2) ;
		s2.getIncomingTransition().add(t2) ;
		root2.getOwnedState().add(s3) ;
		root2.getOwnedState().add(s4) ;
		root2.setInitialState(s3) ;
		root2.getFinalState().add(s4) ;
		m2.setRoot(root2) ;
		
		combine(m1, m2) ;*/
	}
}
