import React, { Component } from 'react';
import './App.css';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import SetupList from './SetupList';
import SetupEdit from "./SetupEdit";
import ConfigurationList from './ConfigurationList';
import ConfigurationEdit from "./ConfigurationEdit";

/*
import DeviceList from './DeviceList';
import DeviceEdit from "./DeviceEdit";
*/

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/api/setup' exact={true} component={SetupList}/>
            <Route path='/api/setup/:id' component={SetupEdit}/>
            <Route path='/api/configurations' exact={true} component={ConfigurationList}/>
            <Route path='/api/configurations/:id' component={ConfigurationEdit}/>
            
          </Switch>
        </Router>
    )
  }
}

export default App;
