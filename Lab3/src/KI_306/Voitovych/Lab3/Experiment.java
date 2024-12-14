package KI_306.Voitovych.Lab3;
/*
 * Interface contains methods for working with the main experiment cat
 */
interface ShredingExperiment {
	void Box();
	void putPoison();
	void outPoison();
}
/*
 * Interface contains methods for working with the experiment cat
 */
interface Experiment extends ShredingExperiment{
	void checkExperiment();
}