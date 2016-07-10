import React, {Component} from 'react';

class Article extends Component {

  componentDidMount() {
    var testEditor;
    $(function () {
      testEditor = editormd("editor", {
        width: "100%",
        height: 640,
        syncScrolling: "single",
        path: "res/editor/lib/"
      });
    });
  }

  render() {
    return (
      <div className=" ui container">
        <form action="/new" method="post">
          <div className="ui form form-top">
            <div className="ui left aligned large header">Post New Article</div>
            <div className="inline fields">
              <div className="eight wide field">
                <label>Ttitle</label>
                <input placeholder="" name="title" type="text"/>
              </div>
            </div>
            <div className="inline fields">
              <div className="four wide field">
                <label>Category</label>
                <input placeholder="" name="category" type="text"/>
              </div>
            </div>
          </div>
          <div id="editor">
            <textarea name="content" style={{display: "none"}}></textarea>
          </div>
          <div className="ui form">
            <div className="inline fields">
              <div className="six wide field">
                <label>Tag</label>
                <input name="tag" placeholder="using , split if more tags exist" type="text"/>
              </div>
            </div>
            <div className="submit-button">
              <button className="ui button black " type="submit"> Submit</button>
            </div>
          </div>
        </form>
      </div>
    )
  }
}

export default Article;
