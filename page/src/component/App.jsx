import React,{Component} from 'react';
import {Link} from 'react-router';
import './App.less';

class App extends Component {

  toggleSideBar = ()=>{
    console.log('click');
      $('.ui.labeled.icon.sidebar')
          .sidebar({context:$('#app')})
          .sidebar('setting', 'transition', 'push')
          .sidebar('toggle')
      ;
  };

    render(){
      return (
        <div id="app">
            <div className="ui left demo vertical inverted sidebar labeled icon menu">
                <Link to="/" className="item">
                    <i className="home icon"></i>
                    Home
                </Link>
                <Link to="/list" className="item">
                    <i className="block layout icon"></i>
                    Articles
                </Link>
                <Link to="/categories" className="item">
                    <i className="smile icon"></i>
                    Categories
                </Link>
            </div>

            <div className="pusher " id="menu">
                <div className="menu-left">
                    <button className="ui black icon button" onClick={() => this.toggleSideBar()}>
                        <i className="align justify icon"></i>Menu
                    </button>
                </div>

                <div>
                    {this.props.children}
                </div>

            </div>
        </div>
      )
    }
}


export default App;
