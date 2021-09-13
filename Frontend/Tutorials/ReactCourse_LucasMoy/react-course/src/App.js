import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
    
    <select>
      <option value="burning">Burning House</option>
      <option value="futurama">Futurama</option>
      <option value="history">History Channel</option>
      <option value="philosoraptor">Philosoraptor</option>
      <option value="smart">Smart Guy</option>
      <option value="matrix">Matrix</option>
    </select> <br/>
    
    <input type="text" placeholder="Line 1"/> <br/>
    
    <input type="text" placeholder="Line 2"/> <br/>
    
    <button>Export</button>
    </div>
  );
}

export default App;
