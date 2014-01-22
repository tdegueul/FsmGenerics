package fsmgenerics.fsm ;

import fsmgenerics.Fsm_MT ;
import fsmgenerics.IFsm ;
import fsmgenerics.IState ;
import fsmgenerics.ITransition ;
import fsmgenerics.tfsm.TFsm ;
import fsmgenerics.tfsm.TFsm_MM ;
import fsmgenerics.tfsm.TState ;
import fsmgenerics.tfsm.TTransition ;

public class Fsm_MM implements Fsm_MT<Fsm, State, Transition>
{
	Fsm root ;
	
	@Override
	public Fsm getRoot() {
		return root ;
	}
	
	@Override
	public void setRoot(Fsm f) {
		root = f ;
	}
	
	@Override
	public void print() {
		for (State s : root.getOwnedState()) {
			System.out.println("State " + s.getName()) ;
			
			for (Transition t : s.getOutgoingTransition()) {
				System.out.println("Transition " + t.getInput() + "(" + t.getOutput() + ")") ;
			}
		}
		
		System.out.println() ;
	}
	
	public static <F extends IFsm<F, S, T>, S extends IState<F, S, T>, T extends ITransition<F, S, T>, F2 extends IFsm<F2, S2, T2>, S2 extends IState<F2, S2, T2>, T2 extends ITransition<F2, S2, T2>> Fsm_MT<F, S, T> combine(Fsm_MT<F, S, T> m1, Fsm_MT<F2, S2, T2> m2) {
		for (S2 s : m2.getRoot().getOwnedState()) {
			m1.getRoot().getOwnedState().add(s) ; // Can't mix elements of both models, even if they belong to the same metamodel
		}
		
		return m1 ;
	}
	
	public static void main(String[] args) {
		Fsm_MM m1 = new Fsm_MM() ;
		Fsm root1 = new Fsm() ;
		State s1 = new State() ;
		s1.setName("s1") ;
		s1.setOwningFsm(root1) ;
		State s2 = new State() ;
		s2.setName("s2") ;
		s2.setOwningFsm(root1) ;
		Transition t1 = new Transition() ;
		t1.setSource(s1) ;
		t1.setTarget(s2) ;
		t1.setInput("I1") ;
		t1.setOutput("O1") ;
		s1.getOutgoingTransition().add(t1) ;
		s2.getIncomingTransition().add(t1) ;
		root1.getOwnedState().add(s1) ;
		root1.getOwnedState().add(s2) ;
		root1.setInitialState(s1) ;
		root1.getFinalState().add(s2) ;
		m1.setRoot(root1) ;
		
		Fsm_MM m2 = new Fsm_MM() ;
		Fsm root2 = new Fsm() ;
		State s3 = new State() ;
		s3.setName("s3") ;
		s3.setOwningFsm(root1) ;
		State s4 = new State() ;
		s4.setName("s4") ;
		s4.setOwningFsm(root2) ;
		Transition t2 = new Transition() ;
		t2.setSource(s3) ;
		t2.setTarget(s4) ;
		t2.setInput("I2") ;
		t2.setOutput("O2") ;
		s1.getOutgoingTransition().add(t2) ;
		s2.getIncomingTransition().add(t2) ;
		root2.getOwnedState().add(s3) ;
		root2.getOwnedState().add(s4) ;
		root2.setInitialState(s3) ;
		root2.getFinalState().add(s4) ;
		m2.setRoot(root2) ;
		
		TFsm_MM m3 = new TFsm_MM() ;
		TFsm root3 = new TFsm() ;
		TState s5 = new TState() ;
		s5.setName("s5") ;
		s5.setOwningFsm(root3) ;
		TState s6 = new TState() ;
		s6.setName("s6") ;
		s6.setOwningFsm(root3) ;
		TTransition t3 = new TTransition() ;
		t3.setSource(s5) ;
		t3.setTarget(s6) ;
		t3.setInput("I3") ;
		t3.setOutput("O3") ;
		s5.getOutgoingTransition().add(t3) ;
		s6.getIncomingTransition().add(t3) ;
		root3.getOwnedState().add(s5) ;
		root3.getOwnedState().add(s6) ;
		root3.setInitialState(s5) ;
		root3.getFinalState().add(s6) ;
		m3.setRoot(root3) ;
		
		combine(m1, m2).print() ;
		combine(m1, m3).print() ;
		combine(m3, m2).print() ;
	}
}
