/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.BasicPackage;
import com.opcoach.generator.basic.FloatGenerator;

import com.opcoach.generator.impl.RangeGeneratorImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FloatGeneratorImpl extends RangeGeneratorImpl<Float> implements FloatGenerator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FloatGeneratorImpl()
	{
		this(0.0f, 100.0f);
	}

		
    /**  Build it with low and high bounds */
	public FloatGeneratorImpl(Float vlow, Float vhigh) 
	{
		super(vlow, vhigh);
		step = 1.0f;  // must be adjusted if high-low < 1.0
	}
	
	
	@Override
	protected Float generateRandomValue()
	{
		 // Generate random value.
	   	  float result =  getRandomizer().nextFloat();
	   	  if (result > (high - low))
	   	  {
	   		  // Must adjust the value. 
	   		  result = (float) (result - 0.5f);
	   	  }
	   	  // Can return the result .
	   	  return low + result;

	}



	@Override
	protected Float generateSimpleValue()
	{
		float result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result =  lastGeneratedValue + step;
			// Restart � low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BasicPackage.Literals.FLOAT_GENERATOR;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setLow(Float newLow)
	{
		super.setLow(newLow);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setHigh(Float newHigh)
	{
		super.setHigh(newHigh);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setStep(Float newStep)
	{
		super.setStep(newStep);
	}

} //FloatGeneratorImpl