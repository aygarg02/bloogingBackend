import React from 'react'; 
import './styleform.css';
import { Link } from 'react-router-dom'; // Import Link from react-router-dom
import './newUser';
const BasicForm = () => {
  return (
    <div className='form'>
      <form>
        <label htmlFor="username">Username:</label><br />
        <input type="text" id="username" name="username"/><br/><br/>
        
        <label htmlFor="password">Password:</label><br/>
        <input type="password" id="password" name="password"/><br/><br/>
        
        <input type="submit" value="Submit"/>
      </form>
      <Link to="/newUser">New User Registration</Link> {/* Use Link instead of anchor tag */}
    </div>
  );
}

export default BasicForm;
